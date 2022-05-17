public class cliente {
private String nomeSegurado;
private double idade;
private int cidade;
private  double ValorPremio ;
public cliente() {
	nomeSegurado=" ";
	idade=0;
	cidade=0;
	ValorPremio=0;
}
public cliente(String nomeSegurado,double idade,double ValorPremio,int cidade) {
	this.nomeSegurado=nomeSegurado;
	this.idade=idade;
	this.ValorPremio=ValorPremio;
	this.cidade=cidade;
}
public String getNomeSegurado() {
	return nomeSegurado;
}
public void setNomeSegurado(String nomeSegurado) {
	this.nomeSegurado = nomeSegurado;
}
public double getIdade() {
	return idade;
}
public void setIdade(double idade) {
	this.idade = idade;
}
public double getValorPremio() {
	return ValorPremio;
}
public void setValorPremio( double ValorPremio) {
	this.ValorPremio = ValorPremio;
}
public int getCidade() {
	return cidade;
}
public void setCidade(int cidade) {
	this.cidade = cidade;
}
public double valorLiquido() {
	double desconto=0;
	double aumento=0;
	double valorLiquido=0;
{
if(idade>=18||idade<=25) {
	aumento=ValorPremio*20/100.0;
}else if(idade>=25||idade>=36) {
	aumento=ValorPremio*15/100.0;
}else if(idade>=36){
	aumento=ValorPremio*10/100.0;
}else {
	System.out.println("Idade indisponivel");
}
if(cidade==1) 
	desconto=ValorPremio*20/100;
else if(cidade==2) {
desconto=ValorPremio*15/100;
}else if(cidade==3) {
desconto=ValorPremio*10/100;
}else if(cidade==4) {
desconto=ValorPremio*5/100;
}else{
System.out.println("Não havera desconto!!");
}
valorLiquido=ValorPremio+aumento-desconto;
return(valorLiquido);
}
}
}
