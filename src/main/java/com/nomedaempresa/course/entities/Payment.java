package com.nomedaempresa.course.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_payment")
@Getter
@Setter
@NoArgsConstructor
public class Payment extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private Instant moment;

    @OneToOne
    @MapsId
    @JsonIgnore
    private Order order;

    public Payment(Long id, Instant moment, Order order) {
        super();
        this.id = id;
        this.moment = moment;
        this.order = order;
    }

}
