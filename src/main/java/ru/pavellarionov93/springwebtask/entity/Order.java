package ru.pavellarionov93.springwebtask.entity;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private Double price;


    public String getTitle() { return title; }
    public void setTitle(String title) {this.title = title; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", title='" + title +
                ", price='" + price +
                '}';
    }

}