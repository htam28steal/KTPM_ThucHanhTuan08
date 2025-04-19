package fit.iuh.entities;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class Order {
	  @Id
	    @GeneratedValue(strategy = GenerationType.UUID)
	    private UUID id;
	
	    private String customerId;
	    private List<OrderItem> items;
	    private String status;
	    private Date createdAt;

}
