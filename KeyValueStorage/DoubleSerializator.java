package KeyValueStorage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class DoubleSerializator implements SerializationStrategyDouble {
    @Override
    public void serializeToFile(Double value, DataOutput output) throws IOException {
        output.writeDouble(value);
    }

    @Override
    public Double deserializeFromFile(DataInput input) throws IOException {
        return input.readDouble();
    }

    @Override
    public String getType() {
        return Double;
    }
}