package AutowiringByConstructor;

public class CarByConstructor {
	
SpecificationByConstructor spec1;
CarByConstructor(SpecificationByConstructor spec){
	this.spec1=spec;
}

//public void setSpec(Specification spec) {
//	this.spec1 = spec;
//}

@Override
public String toString() {
	return spec1.model+'\n'+spec1.make;
}


}
