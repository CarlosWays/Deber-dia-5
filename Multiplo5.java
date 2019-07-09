public class Multiplo5{
	private int num;
	public Multiplo5(int num){
		this.num=num;
		
	}
	public void setNum(int num){
		num=num;
	}
	public float getNum(){
		return num;
	}
	public void mul5(){
		if(num%5==0){
			System.out.println("Es multiplo de 5.");
		}else{System.out.println("No es multiplo de 5.");
		}
	}
}