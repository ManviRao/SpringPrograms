package AutowiringByName;

public class Car {
	
Specification spec1;
Car(){
	System.out.println("Inside car constructor");
	
}

public void setSpec1(Specification spec) {
	this.spec1 = spec;
}

@Override
public String toString() {
	return spec1.model+'\n'+spec1.make;
}


}
