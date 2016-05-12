package ${package}.service;
import org.codehaus.jackson.annotate.JsonProperty;
import java.io.Serializable;
import java.util.UUID;

public class Payload implements Serializable {

    private static final long serialVersionUID = -1549643581827130116L;

    @JsonProperty("payload")
    private Object payload;

    @JsonProperty("request_id")
    private String request_id = UUID.randomUUID().toString();


    public Payload() {}

    public Payload(Object payload) {
        this.payload = payload;
    }

    public Object getPayload() {
        return payload;
    }


    public void setPayload(Object payload) {
        this.payload = payload;
    }

}
