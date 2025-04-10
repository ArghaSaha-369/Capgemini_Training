package day_25_hashMap;

public class HashMapImplementation {
	int size = 16;
	Entry buckets[] = new Entry[size];
	
	public int getBucketIndex(int key) {
		return Math.abs(Integer.hashCode(key))%size;
	}
	
	public void put(int key, int value) {
		Entry node = new Entry(key, value);
		int index = getBucketIndex(key);
		System.out.println("The entry is added at index: "+index);
		Entry current = buckets[index];
		
		while(current != null) {
			if(current.key == key) {
				current.value = value;
				return;
			}
			current = current.next;
		}
		
		node.next =buckets[index];
		buckets[index] = node;
	}
	
	public int getValue(int key) {
		int index = getBucketIndex(key);
		Entry current = buckets[index];
		
		while(current != null) {
			if (current.key == key) {
				return current.value;
			}
			current = current.next;
		}
		return -1;
	}
	public static void main(String[] args) {
		HashMapImplementation map = new HashMapImplementation();
		map.put(10, 1);
		map.put(20, 9);
		
	}
}
