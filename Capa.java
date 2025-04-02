package capa;


public class Capa {
   private String cor;
   private String material;
   private double preco;


   public Capa(String cor, String material, double valor) {
      this.cor = cor;
      this.material = material;
      this.preco = preco;


   }


   public Capa() {


   }


   public String getCor() {
       return this.cor;
   }


   public void setCor(String cor) {
       this.cor = cor;
   }


   public String getMaterial() {
       return this.material;
   }
   public void setMaterial(String material) {
       this.material = material;
   }


   public void setPreco(double preco) {
       this.preco = preco;
   }




   public double getpreco() {
      return this.preco;
   }


}

