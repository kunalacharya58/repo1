package demo.practice.spring;

public class Intel implements Processor {
	
	public Intel() {
		System.out.println("Intel processor installed !");
	}

	@Override
	public void playGames() {
		System.out.println("Intel is playing Game!");
	}

	@Override
	public void runApps() {
		System.out.println("Intel is running Applications!");
	}

	@Override
	public void executePrograms() {
		System.out.println("Intel is executing your code!");
	}

}
