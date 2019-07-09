public class Multiplo3{
	private int num;
	public Multiplo3(int num){
		this.num=num;
		
	}
	public void setNum(int num){
		num=num;
	}
	public float getNum(){
		return num;
	}
	public void mul3(){
		if(num%3==0){
			System.out.println("Es multiplo de 3.");
		}else{System.out.println("No es multiplo de 3.");
		}
	}
}