package final1;

public class SkipNode<K extends Comparable<K>, V> {
   /**
    * A variable that holds the key
    */
   private K key;

   /**
    * A variable that holds the value
    */
   private V value;

   /**
    * A variable that holds the level
    */
   private int level;

   /**
    * A variable that holds the forward
    */
   private SkipNode<K, V>[] forward;

   /**
    * The constructor of the class
    * @param key to be inserted
    * @param elem to be inserted
    * @param level to be used
    */
   @SuppressWarnings("unchecked")
   public SkipNode(K key, V elem, int level) {
       //rec = new KVPair<K, E>(key, elem);
       this.key = key;
       this.value = elem;
       this.level = level;
       forward = new SkipNode[level + 1];
       for (int i = 0; i < level; i++) {
           forward[i] = null;
       }
   }

   /**
    * A getter method for the key
    * @return the key
    */
   public K getKey() {
       return key;
   }

   /**
    * A getter method for the value
    * @return the value
    */
   public V getValue() {
       return value;
   }

   /**
    * A method that switches the value to string
    * @return String
    */
   public String toString() {
       String string = "(" + getKey() + ", " + getValue() + ")";
       return string;
   }

   /**
    * A method that returns the forward variable
    * @return SkipNode<K, V>[]
    */
   public SkipNode<K, V>[] getForward() {
       return forward;
   }

   /**
    * A method that returns the level
    * @return the level
    */
   public int getLevel() {
       return level;
   }

   /**
    * A setter method for the level variable
    * @param level the level to set
    */
   public void setLevel(int level) {
       this.level = level;
   }
}




