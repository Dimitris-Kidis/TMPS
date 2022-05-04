package com.company;

// Concrete Collection

public class Backpack implements Container{
    String[] items = {"Hammer", "Apples", "Fork", "Phone", "Notes", "Gum"};
    int[] items2 = {1, 2, 3,4};

    @Override
    public Iterator<String> getIterator() {
        return new itemsIterator();
    }

    // используем лишь раз, поэтому private
    private class itemsIterator implements Iterator {

        // Concrete Iterator

        int index = 0;

        @Override
        public boolean hasNext() {
            if ( index < items.length ) {
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            return items[index++];
        }


    }
}
