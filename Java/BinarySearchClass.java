package binarysearch;

import static java.nio.file.Files.size;

public class BinarySearchClass {
    int first=0;
    int last = size-1;
    int middle;
    int found =0;
    int position = -1;
    public class Search(int size , int key, int array[]) 
    while (!found && first <= last)
    {
        middle=(first+last)/2;
        if(array[middle]==key)
        {
            found=1;
            position = middle;
        }
        else if (key<array[middle])
            last = middle-1;
        else
            first = middle+1;
    }
    return position;
    
}
