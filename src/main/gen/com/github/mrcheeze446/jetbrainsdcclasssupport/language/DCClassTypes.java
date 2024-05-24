// This is a generated file. Not intended for manual editing.
package com.github.mrcheeze446.jetbrainsdcclasssupport.language;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.mrcheeze446.jetbrainsdcclasssupport.language.psi.DCClassElementType;
import com.github.mrcheeze446.jetbrainsdcclasssupport.language.psi.DCClassTokenType;
import com.github.mrcheeze446.jetbrainsdcclasssupport.language.psi.*;

public interface DCClassTypes {

  IElementType PROPERTY = new DCClassElementType("PROPERTY");

  IElementType COMMENT = new DCClassTokenType("COMMENT");
  IElementType CRLF = new DCClassTokenType("CRLF");
  IElementType KEY = new DCClassTokenType("KEY");
  IElementType SEPARATOR = new DCClassTokenType("SEPARATOR");
  IElementType VALUE = new DCClassTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new DCPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
