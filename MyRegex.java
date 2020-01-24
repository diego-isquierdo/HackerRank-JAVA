package HackerRank;

public class MyRegex {
	public String octeto = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	//public String octeto = "(\\d{1,3})";
	public String pattern = octeto+ "\\."+octeto+ "\\."+octeto+ "\\."+octeto;
}
