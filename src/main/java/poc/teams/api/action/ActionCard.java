package poc.teams.api.action;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;
import poc.teams.api.input.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * https://docs.microsoft.com/en-us/outlook/actionable-messages/card-reference#actioncard-action
 * <p>
 * Presents additional UI that contains one or more Inputs, along with
 * associated actions that can be either OpenUri or HttpPOST types.
 */
@Data
@JsonTypeName("ActionCard")
public class ActionCard implements Action {

    private String name;
    private List<Input> inputs;
    private List<Action> actions;

    public ActionCard() {
    }

    public ActionCard(String name) {
        this.name = name;
    }

    public ActionCard(String name, List<Input> inputs, List<Action> actions) {
        this.name = name;
        this.inputs = inputs;
        this.actions = actions;
    }

    public void addInput(Input... inputs) {
        if (null == this.inputs) this.inputs = new ArrayList<>();
        for (Input input : inputs) this.inputs.add(input);
    }

    public void addAction(Action... actions) {
        if (null == this.actions) this.actions = new ArrayList<>();
        for (Action action : actions) this.actions.add(action);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActionCard that = (ActionCard) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(inputs, that.inputs) &&
                Objects.equals(actions, that.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, inputs, actions);
    }

    public String toString() {
        return "ActionCard(name=" + this.getName() + ", inputs=" + this.getInputs() + ", actions=" + this.getActions() + ")";
    }

    // Builder (delombok'd from lombok.Builder)
    public static ActionCardBuilder builder() {
        return new ActionCardBuilder();
    }

    public static class ActionCardBuilder {
        private String name;
        private List<Input> inputs;
        private List<Action> actions;

        ActionCardBuilder() {
        }

        public ActionCardBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ActionCardBuilder inputs(List<Input> inputs) {
            this.inputs = inputs;
            return this;
        }

        public ActionCardBuilder actions(List<Action> actions) {
            this.actions = actions;
            return this;
        }

        public ActionCardBuilder addInput(Input... inputs) {
            if (null == this.inputs) this.inputs = new ArrayList<>();
            for (Input input : inputs) this.inputs.add(input);
            return this;
        }

        public ActionCardBuilder addAction(Action... actions) {
            if (null == this.actions) this.actions = new ArrayList<>();
            for (Action action : actions) this.actions.add(action);
            return this;
        }

        public ActionCard build() {
            return new ActionCard(name, inputs, actions);
        }

        public String toString() {
            return "ActionCard.ActionCardBuilder(name=" + this.name + ", inputs=" + this.inputs + ", actions=" + this.actions + ")";
        }
    }

}