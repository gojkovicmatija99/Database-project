package observer;

import observer.enums.NotificationCode;
import resource.implementation.InformationResource;

public class Notification {
    private NotificationCode code;
    private Object data;

    public Notification(NotificationCode resourceLoaded, InformationResource ir) {
        this.code = resourceLoaded;
        this.data = ir;
    }

    public NotificationCode getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    public void setCode(NotificationCode code) {
        this.code = code;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
