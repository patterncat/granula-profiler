package nl.tudelft.pds.granula.profiler.comm.message;

/**
 * Created by wlngai on 1/9/16.
 */
public class ClientTerminateRESTfulResponse implements Response {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
