/*
 *  Constraint Predicate implementation
 *
 *  Copyright (c) 1995-2012, The University of Sheffield. See the file
 *  COPYRIGHT.txt in the software or at http://gate.ac.uk/gate/COPYRIGHT.txt
 *
 *  This file is part of GATE (see http://gate.ac.uk/), and is free
 *  software, licenced under the GNU Library General Public License,
 *  Version 2, June 1991 (in the distribution as file licence.html,
 *  and also available at http://gate.ac.uk/gate/licence.html).
 *
 *  Eric Sword, 03/09/08
 *
 *  $Id: NotRegExpMatchPredicate.java 15333 2012-02-07 13:18:33Z ian_roberts $
 */
package gate.jape.constraint;

import java.util.regex.Matcher;

/**
 * Implementation of the !=~ predicate, which fails if the entire
 * annotation value matches the given regular expression, and succeeds
 * otherwise.
 */
public class NotRegExpMatchPredicate extends AbstractRegExpPredicate {

  @Override
  protected boolean matcherResult(Matcher m) {
    return !m.matches();
  }

  public String getOperator() {
    return NOT_REGEXP_MATCH;
  }

}
