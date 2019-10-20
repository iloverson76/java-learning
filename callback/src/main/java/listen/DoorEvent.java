package listen;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.EventObject;

/**
 * @author chp
 * @version 1.0
 * @date 2019-10-20 22:30
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class DoorEvent extends EventObject {

    /**
     * 门的状态:开或者关
     */
    private String doorState;


    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public DoorEvent(Object source) {
        super ( source );
    }
}
