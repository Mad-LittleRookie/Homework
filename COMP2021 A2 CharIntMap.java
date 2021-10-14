package hk.edu.polyu.comp.comp2021.assignment2.charintmap;

public class CharIntMap {

    private KeyValueEntry[] storage; // Internal storage of the map.

    private int count;// The number of key-value pairs currently stored in the map.

    public CharIntMap(int size) {
        // constructor
        this.storage = new KeyValueEntry[size];
        this.count = 0;
    }

    public int getValue(char key){
        // Return the value associated to the key
        // This method should only be called when containsKey(key) is true
        int a;
        for(int i = 0;i < this.storage.length;i++){
            if(this.storage[i].getKey() == key){
                a = this.storage[i].getValue();
                return a;
            }
        }
        return 0;
    }

    public boolean isFull(){
        //Returns true if and only if the map contains the maximum number of keys.
        if (this.count == this.storage.length)
        {return true;}
        return false;
    }
    public boolean containsKey(char key) {
        // Returns true if and only if this map contains a mapping for the specified key.
//        System.out.println(this.storage[1].getKey());
        for(int i=0;i<this.storage.length;i++){
            if( this.storage[i].getKey() == key){
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(int value) {
        // Returns true if and only if this map maps one or more keys to the specified value.
        for(int i=0;i < this.count;i++){
            if(this.storage[i].getValue() == value){
                return true;
            }
        }
        return false;
    }


    public void put(char key, int value) {
        //Associates the specified value with the specified key in this map.
        //If the map previously contained a mapping for the key, the old value is replaced by the specified value
//        System.out.println(this.storage.length);
            if(this.storage[this.count] == null){
                this.storage[this.count] = new KeyValueEntry(key,value);
                this.count = this.count + 1;
//                System.out.println(this.count);
            }

        }

    public void remove(char key) {
        // Removes the mapping for a key from this map if it is present
        for(int i=0;i<this.count;i++)
        {
            if(this.storage[i].getKey() == key)
            {
                for (int l=i;l<this.count-1;l++){
                    this.storage[i]=this.storage[i+1];
                }
            count--;
            }

        }
    }

    public void replace(char key, int value) {
        // Replaces the entry for the specified key if and only if it is currently mapped to some value.
        for(int i=0;i<this.count;i++){
            if(this.storage[i].getKey() == key){
                KeyValueEntry a = new KeyValueEntry(key,value);
                this.storage[i] = a;
            }
        }

    }


    public void merge(char key, int value){
        //If the specified key is not in this map, associates it with the given non-null value.
        //Otherwise, replaces the associated value with the addition of the associated value and the given non-null value.
        /// care about this
        int x=0;
        for(int i=0;i<this.count;i++){
            if(this.storage[i].getKey() == key){
                this.storage[i].setValue(value+this.storage[i].getValue());
                x++;
            }
        }
        if (x==0){
            this.storage[this.count] = new KeyValueEntry(key,value);
            count++;
        }

    }

    public String keyString() {
        // Returns a String concatenated from the keys in this map
        String str = "";
        for(int i=0;i<this.storage.length;i++){
            if(this.storage[i]==null){
                continue;
            }
            str = str+this.storage[i].getKey();
        }
        return str;
    }

    public boolean hasSameKeys(CharIntMap map) {
        // Return true if and only if the keys of this map are exactly the same as those in the given map.
//        int i = map.count;
//        int l = this.count;
        if(map.count!=this.count){
            return false;
        }
//        int mid = i;
//        if(this.count<map.count){
//            mid = this.count;
//        }
        //int x=0;
        for(int m=0;m<this.count;m++){

            if (map.containsKey(this.storage[m].getKey())) continue;
            else return false;
            //x=0;
        }
        return true;
//        for(int ct=0;ct<mid;ct++){
//            if(map.storage[ct].getKey()!=this.storage[ct].getKey()){
//                return false;
//            }
//        }
//        if(mid == i){
//            for(int ct2=i;ct2<l;ct2++){
//                if(this.storage[ct2]!=null)
//                {return false;}
//
//            }
//        }
//        if(mid!=i){
//            for(int ct2=l;ct2<i;ct2++){
//                if(this.storage[ct2]!=null){
//                    return false;
//                }
//
//            }
//        }
    }

    // ==================================

}

class KeyValueEntry {

    private char key;

    private int value;

    KeyValueEntry(char key, int value) {

        this.key = key;

        this.value = value;

    }


    public char getKey() {

        return this.key;

    }

    public int getValue() {

        return this.value;

    }

    public void removeKey(char key) {

        this.key = '0';

    }

    public void replace(char key,int value){
        this.key = key;
        this.value = value;
    }
    public void setValue(int val) {

        this.value = val;

    }
}

