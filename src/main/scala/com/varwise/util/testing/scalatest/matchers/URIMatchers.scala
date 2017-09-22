package com.varwise.util.testing.scalatest.matchers

import akka.http.scaladsl.model.Uri
import org.scalatest.matchers.{MatchResult, Matcher}

/**
 * A trait providing URI matchers for scalatest
 */
trait URIMatchers {
  class URIMatcher(expected: String) extends Matcher[String] {
    private def compareURI(a: String, b: String) = {
      val aParsed = Uri(a)
      val bParsed = Uri(b)

      aParsed.path == bParsed.path && aParsed.query().toMap == bParsed.query().toMap
    }

    override def apply(left: String): MatchResult = {
      MatchResult(
        compareURI(expected, left),
        s"URI $left did not match expected $expected",
        s"URI $left did match expected $expected"
      )
    }
  }

  /**
   * Performs a URI comparison ignoring ordering of the query parameters
   * @param expected URI that is expected to be matched
   * @return
   */
  def matchIgnoreParameterOrdering(expected: String) = new URIMatcher(expected)
}

// Companion object to simplify importing
object URIMatchers extends URIMatchers