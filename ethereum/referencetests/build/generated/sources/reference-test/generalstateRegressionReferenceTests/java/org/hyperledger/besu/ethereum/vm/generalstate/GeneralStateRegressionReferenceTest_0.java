package org.hyperledger.besu.ethereum.vm.generalstate;

import static org.hyperledger.besu.ethereum.vm.GeneralStateReferenceTestTools.executeTest;
import static org.hyperledger.besu.ethereum.vm.GeneralStateReferenceTestTools.generateTestParametersForConfig;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.hyperledger.besu.ethereum.referencetests.GeneralStateTestCaseEipSpec;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

/** The general state test operation testing framework entry point. */
public class GeneralStateRegressionReferenceTest_0 {

  private static final String[] TEST_CONFIG_FILE_DIR_PATH = new String[] {"regressions/generalstate/ripeMdAccountShouldNotBeDeletedWhenNonEmptyAndTouchedTransactionFails.json", "regressions/generalstate/ripeMdAccountShouldNotBeDeletedWhenNonEmptyAndTouchedTransactionSucceeds.json", "regressions/generalstate/ripeMdAccountShouldNotBeDeletedWhenEmptyAndTouchedTransactionFails.json", "regressions/generalstate/ripeMdAccountShouldBeDeletedWhenEmptyAndTouchedTransactionSucceedsPostEIP158.json"};

  public static Stream<Arguments> getTestParametersForConfig() {
    return generateTestParametersForConfig(TEST_CONFIG_FILE_DIR_PATH).stream().map(params ->
        Arguments.of(params[0], params[1], params[2])
        );
  }

  @ParameterizedTest(name = "Name: {0}")
  @MethodSource("getTestParametersForConfig")
  public void execution(
      final String name,
      final GeneralStateTestCaseEipSpec spec,
      final boolean runTest) {
    assumeTrue(runTest, "Test " + name + " was ignored");
    executeTest(spec);
  }
}
