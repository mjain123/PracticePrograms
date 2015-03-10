
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sheep myD = new Sheep();
		Animal a = new Animal();
		myD.eat((Animal)myD);
		myD.eat(a);
		Animal mD= new Sheep();
		mD.eat(mD);
		mD.eat(myD);
		mD.eat(a);
	}

}
class Animal{
    public void eat(Animal a) {
    	System.out.println("1");
    }
  }

 class Sheep extends Animal{
	 public void eat(Sheep d){
	    	System.out.println("2");

	 }
	 public void eat(Animal a){
		 super.eat(a);
	    	System.out.println("3");

	 }
  }