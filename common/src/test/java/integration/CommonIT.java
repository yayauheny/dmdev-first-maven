package integration;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CommonIT {

  @Test
  public void whenCalledIsBlankThenCorrect() {
    Assertions.assertTrue(StringUtils.isBlank(" "));
  }
}
