package kadai_017;

public abstract class Kato_Chapter17 {

	public String familyName = "加藤";
	public String givenName;
	public String address = "住所は東京都中野区〇×です";
	

	public void commonIntroduce(){
		System.out.println(this.familyName + this.givenName + "です");
		System.out.println(this.address);
	}

	abstract void eachIntroduce();

	public void exeIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
	
}
