
package eu.netide.core.caos.composition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Arrays;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "", namespace = "http://netide.eu/schemas/compositionspecification/v1")
@XmlRootElement(name = "If", namespace = "http://netide.eu/schemas/compositionspecification/v1")
public class If extends ExecutionFlowNodeContainer {
    @Override
    public String toString() {
        return "If [flowNodes={" + Arrays.toString(this.getFlowNodes().toArray()) + "}]";
    }
}
