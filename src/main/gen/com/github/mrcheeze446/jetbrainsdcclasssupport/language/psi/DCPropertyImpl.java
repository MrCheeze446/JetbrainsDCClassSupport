// This is a generated file. Not intended for manual editing.
package com.github.mrcheeze446.jetbrainsdcclasssupport.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.mrcheeze446.jetbrainsdcclasssupport.language.DCClassTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class DCPropertyImpl extends ASTWrapperPsiElement implements DCProperty {

  public DCPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DCVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DCVisitor) accept((DCVisitor)visitor);
    else super.accept(visitor);
  }

}
