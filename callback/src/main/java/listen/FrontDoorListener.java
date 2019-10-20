package listen;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author chp
 * @version 1.0
 * @date 2019-10-20 22:54
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class FrontDoorListener implements IDoorListener {
    /**
     * 具体的开门关门动作
     * @param event
     */
    @Override
    public void dealDoorEvent(DoorEvent event) {

        if(null!=event.getDoorState ()&&event.getDoorState ().equals ( "open" )){

            System.out.println ( "front door opened" );

        }else {
            System.out.println ( "front door closed" );
        }
    }
}
