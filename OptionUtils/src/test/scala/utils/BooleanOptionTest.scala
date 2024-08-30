package utils

import org.scalatest.Outcome
import org.scalatest.flatspec.FixtureAnyFlatSpecLike
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import utils.BooleanOption.BooleanOptionImplicit

class BooleanOptionTest extends FixtureAnyFlatSpecLike {

  override protected type FixtureParam = EntityForTest

  private[BooleanOptionTest] case class EntityForTest() {}

  override protected def withFixture(test: OneArgTest): Outcome = {
    val entityForTest = EntityForTest()
    test(entityForTest)
  }

  "BooleanOption" should "should return true if it contains true as value" in { entityForTest =>
    Some(true).containsTrue() shouldBe true
  }

  it should "should return false if it does not contain true as value" in { entityForTest =>
    Some(false).containsTrue() shouldBe false
  }

  it should "should return true if it contains false as value" in { entityForTest =>
    Some(false).containsFalse() shouldBe true
  }

  it should "should return false if it does not contain false as value" in { entityForTest =>
    Some(true).containsFalse() shouldBe false
  }
}