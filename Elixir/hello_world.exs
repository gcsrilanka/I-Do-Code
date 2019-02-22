defmodule HelloWorld do
  @doc """
  Hello world, but it applies the function to each element in a separate process.
  """
  def pmap(collection, fun) do
    me = self()

    collection
    |> Enum.map(fn elem ->
      spawn_link(fn -> send(me, {self(), fun.(elem)}) end)
    end)
    |> Enum.map(fn pid ->
      receive do
        {^pid, result} -> result
      end
    end)
  end
end

"Hello, World"
|> String.graphemes()
|> HelloWorld.pmap(&IO.puts/1)
