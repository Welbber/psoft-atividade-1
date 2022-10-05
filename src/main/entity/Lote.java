package src.main.entity;


import java.time.LocalDate;

public class Lote {

    private Integer amount;

    private LocalDate dateV;

    private Product product;

    public Lote(){}

    public Lote(Integer amount, LocalDate dateV, Product product) {
        this.amount = amount;
        this.dateV = dateV;
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public LocalDate getDateV() {
        return dateV;
    }

    public void setDateV(LocalDate dateV) {
        this.dateV = dateV;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "amount=" + amount +
                ", dateV=" + dateV +
                ", product=" + product +
                '}';
    }
}