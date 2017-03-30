
package eu.netide.core.caos.composition;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "", propOrder = {"condition", "if", "else"})
@XmlRootElement(name = "Branch", namespace = "http://netide.eu/schemas/compositionspecification/v1")
public class Branch extends ExecutionFlowNode {
    private Condition condition;
    private If _if;
    private Else _else;

    @XmlElement(name = "BranchCondition", namespace = "http://netide.eu/schemas/compositionspecification/v1")
    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition value) {
        this.condition = value;
    }

    @XmlElement(name = "If", namespace = "http://netide.eu/schemas/compositionspecification/v1", required = true)
    public If getIf() {
        return _if;
    }

    public void setIf(If value) {
        this._if = value;
    }

    @XmlElement(name = "Else", namespace = "http://netide.eu/schemas/compositionspecification/v1", required = true)
    public Else getElse() {
        return _else;
    }

    public void setElse(Else value) {
        this._else = value;
    }

    @Override
    public String toString() {
        return "Branch [Condition=" + condition.toString() + ",If=" + _if.toString() + ",Else=" + _else.toString() + "]";
    }
}
