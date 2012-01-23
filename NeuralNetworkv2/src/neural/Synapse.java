package neural;

import java.io.Serializable;

/**
 * @author Marcel Saarloos
 * @author Stef Dijksman
 */
public class Synapse implements Serializable {

    private Neuron sourceNeuron;
    private double weight;

    public Synapse(Neuron sourceNeuron, double weight) {
        this.sourceNeuron = sourceNeuron;
        this.weight = weight;
    }

    public Neuron getSourceNeuron() {
        return sourceNeuron;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
