class CPU{
	int price = 75000;
	class Processor{
		int num_cores = 16;
		String manufacturer = "Intel";
		static class RAM{
			String memory = "32 GB",manufacturer = "Samsung";
		}
		
	}
}

public class Computer{
	public static void main(String[] args){
		CPU myCPU = new CPU();
		System.out.println("Price of CPU: "+myCPU.price);
		System.out.println("Number of cores : "+myCPU.new Processor().num_cores);
		System.out.println("manufacturer of processor : "+myCPU.new Processor().manufacturer);
		System.out.println("memory : "+new CPU.Processor.RAM().memory);
		System.out.println("manufacturer of RAM: "+new CPU.Processor.RAM().manufacturer);
		
	}
}
