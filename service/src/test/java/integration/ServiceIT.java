package integration;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceIT {

  @Test
  public void whenCalledIsAlphaThenCorrect() {
    Assertions.assertTrue(StringUtils.isAlpha("abc"));
  }
}
