
public class No {

   private Object elemento;
   private No prox;

   public No(Object elemento) {
       this.elemento = elemento;
       this.prox = null;
   }

   public Object getElemento() {
       return elemento;
   }

   public No getProx() {
       return prox;
   }

   public void setElemento(Object elemento) {
       this.elemento = elemento;
   }

   public void setProx(No prox) {
       this.prox = prox;
   }

}
