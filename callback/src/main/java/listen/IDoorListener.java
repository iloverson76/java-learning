package listen;

import java.util.EventListener;

public interface IDoorListener extends EventListener {

   void dealDoorEvent(DoorEvent event);
}
