package listen;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chp
 * @version 1.0
 * @date 2019-10-20 22:31
 */
@Data
@Builder
@AllArgsConstructor
@Accessors(chain = true)
public class DoorManager {

    private List<IDoorListener> listenerList=new ArrayList<> ();

    private void addListener(IDoorListener listener){

        synchronized (this){
            if(null!=listener&&(!listenerList.contains ( listener ))){
                listenerList.add ( listener );
            }
        }
    }

    private void removeListener(IDoorListener listener){

        synchronized (this){
           if(null!=listener&&listenerList.contains ( listener )){
               listenerList.remove ( listener );
           }
       }
    }

    public void notifyDoors(DoorEvent event){

        for (IDoorListener listener : listenerList) {
            listener.dealDoorEvent ( event );
        }
    }

    /**
     * 模拟开门事件
     */
    public void fireOpen(){

        if (null==listenerList){
            return;
        }

        DoorEvent event=new DoorEvent ( this );

        event.setDoorState ( "open" );

        notifyDoors ( event );
    }


}
