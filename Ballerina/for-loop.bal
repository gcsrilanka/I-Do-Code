import ballerina/io;

public function main() {
    io:println("Iterating over a string array:-");
    string[] fruits = ["apple", "banana", "cherry"];
    foreach v in fruits {
        io:println("fruit: " + v);
    }

    io:println("\nIterating over a map:-");
    map<string> words = { a: "apple", b: "banana", c: "cherry" };
    foreach k, v in words {
        io:println("letter: ", k, ", word: ", v);
    }

    io:println("\nIterating over a json object:-");
    json apple = { name: "apple", colors: ["red", "green"], price: 5 };
    foreach j in apple {
        match j {
            string js => {
                io:println("string value: ", js);
            }
            json jx => {
                io:println("non-string value: ", jx);
            }
        }
    }

    io:println("\nIterating over a json array:-");
    json[] colors = check <json[]>apple.colors;
    foreach i, j in colors {
        io:println("color ", i, ": ", j);
    }

    io:println("\nIterating over an xml:-");
    xml book = xml `<book>
                        <name>Sherlock Holmes</name>
                        <author>Sir Arthur Conan Doyle</author>
                    </book>`;
    foreach i, x in book.*.elements(){
        io:println("xml at ", i, ": ", x);
    }

    io:println("\nIterating over a closed integer range:-");
    int endValue = 10;
    int sum;
    foreach i in 1...endValue {
        sum = sum + i;
    }
    io:println("summation from 1 to " + endValue + " is " + sum);

    io:println("\nIterating over a half open integer range:-");
    sum = 0;
    foreach i in 1..<endValue {
        sum = sum + i;
    }
    io:println("summation from 1 to " + endValue + " excluding " + endValue + " is " + sum);
}