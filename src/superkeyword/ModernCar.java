package superkeyword;

public class ModernCar extends Car {

	int run = super.milesItCanRun = 220;

		public ModernCar (String model){
			super(model);
		}
		public void fueltype(){
			super.runOnElectricity();
			System.out.println("more efficient");
			
		}
}
