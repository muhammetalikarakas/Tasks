import java.util.Arrays;

public class MyHashMap<K, V> {

	Object[] KeyArray = new Object[0];
	Object[] ValueArray = new Object[0];

	public MyHashMap() {

	}

	public void Put(K Key, V Value) {
		Object[] KeyDummy = new Object[KeyArray.length];
		Object[] ValueDummy = new Object[ValueArray.length];

		for (int i = 0; i < KeyArray.length; i++) {
			KeyDummy[i] = KeyArray[i];
			ValueDummy[i] = ValueArray[i];
		}
		KeyArray = new Object[KeyArray.length + 1];
		ValueArray = new Object[ValueArray.length + 1];

		for (int i = 0; i < KeyDummy.length; i++) {
			this.KeyArray[i] = KeyDummy[i];
			this.ValueArray[i] = ValueDummy[i];
		}
		this.KeyArray[KeyArray.length - 1] = Key;
		this.ValueArray[ValueArray.length - 1] = Value;

	}

	public Object get(K key) {
		Object result = null;
		for (int i = 0; i < KeyArray.length; i++) {
			if (KeyArray[i] == key) {
				result = ValueArray[i];
			}
		}
		return result;
	}

	public void remove(K key) {
		int count = 0;
		for (Object İ : KeyArray) {
			if (İ == key) {
				count++;
			}
		}
		Object[] KeyDummy = new Object[KeyArray.length - count];
		Object[] ValueDummy = new Object[ValueArray.length - count];
		for (int i = 0; i < KeyDummy.length; i++) {
			for (int j = 0; j < KeyArray.length; j++) {
				if (this.KeyArray[j] != key) {
					KeyDummy[i] = KeyArray[j];
					ValueDummy[i] = ValueArray[j];
					break;
				}
			}
		}
		KeyArray = new Object[KeyDummy.length];
		ValueArray = new Object[ValueDummy.length];
		for (int i = 0; i < KeyDummy.length; i++) {
			KeyArray[i] = KeyDummy[i];
			ValueArray[i] = ValueDummy[i];
		}
	}

	public void clear() {
		KeyArray = new Object[0];
		ValueArray = new Object[0];
	}

	public int size() {
		return KeyArray.length;
	}
}
