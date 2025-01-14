package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderStatusUpdated extends AbstractEvent {

    private Long id;

    public OrderStatusUpdated(Order aggregate) {
        super(aggregate);
    }

    public OrderStatusUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
