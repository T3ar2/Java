public class Carro {
    private String modelo;
    private String cor;
    private int ano;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void mostrarInfo(){
        System.out.println("Modelo: " + modelo + ", Cor: " + cor + ", Ano: " + ano);
    }


}
