public class CompItem {

	String cpu;
	String memory;
	String storage;

	public CompItem(String cpu, String memory, String storage)
	{
		this.cpu = cpu;
		this.memory = memory;
		this.storage = storage;
	}

	public String getCpu() {
		return cpu;
	}

	public String getMemory() {
		return memory;
	}

	public String getStorage() {
		return storage;
	}

	public String toString() {
		return (cpu + memory + storage);
	}
}
