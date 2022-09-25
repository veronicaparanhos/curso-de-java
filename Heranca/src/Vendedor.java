import java.util.Date;

public class Vendedor  extends Funcionario {
   
    private int totalItensVendidos;
    private float comissaoItem;

    public Vendedor () {
        super();

    }

   public float calcularSalario() {
    return super.getSalario() + (this.comissaoItem * totalItensVendidos)
   }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoItem() {
        return comissaoItem;
    }

    public void setComissaoItem(float comissaoItem) {
        this.comissaoItem = comissaoItem;
    }

}


