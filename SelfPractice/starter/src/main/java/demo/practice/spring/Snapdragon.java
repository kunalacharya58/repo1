package demo.practice.spring;

public class Snapdragon implements Processor {
	
	public Snapdragon() {
		System.out.println("Snapdragon processor installed !");
	}

	@Override
	public void playGames() {
		System.out.println("Snapdragon is best for Games!");
	}

	@Override
	public void runApps() {
		System.out.println("Snapdragon runs applications faster!");
	}

	@Override
	public void executePrograms() {
		System.out.println("Snapdragon is executing your code!");
	}

}
