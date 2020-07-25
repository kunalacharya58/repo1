package demo.practice.spring;

public class CPU {
	
	private Processor processor;
	
	public CPU() {
		System.out.println("CPU is connected to the Device.");
	}
	
	public void boot() {
		processor.playGames();
		processor.runApps();
		processor.executePrograms();
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

}
