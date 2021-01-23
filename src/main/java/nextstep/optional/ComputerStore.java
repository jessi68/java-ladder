package nextstep.optional;

import java.util.Optional;
import nextstep.optional.Computer.Soundcard;
import nextstep.optional.Computer.USB;

public class ComputerStore {
    public static final String UNKNOWN_VERSION = "UNKNOWN";

    public static String getVersion(Computer computer) {
        return Optional.ofNullable(computer)
                .map(Computer::getSoundcard)
                .map(Soundcard::getUsb)
                .map(USB::getVersion)
                .orElse(UNKNOWN_VERSION);
    }

    public static String getVersionOptional(Computer computer) {
        return null;
    }
}
