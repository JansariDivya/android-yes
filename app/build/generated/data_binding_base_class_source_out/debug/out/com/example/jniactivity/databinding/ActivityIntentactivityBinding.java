// Generated by view binder compiler. Do not edit!
package com.example.jniactivity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.jniactivity.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityIntentactivityBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button explicit;

  @NonNull
  public final Button implicit;

  @NonNull
  public final ImageButton implicitImage;

  @NonNull
  public final ImageButton implicitTele;

  @NonNull
  public final EditText message;

  private ActivityIntentactivityBinding(@NonNull LinearLayout rootView, @NonNull Button explicit,
      @NonNull Button implicit, @NonNull ImageButton implicitImage,
      @NonNull ImageButton implicitTele, @NonNull EditText message) {
    this.rootView = rootView;
    this.explicit = explicit;
    this.implicit = implicit;
    this.implicitImage = implicitImage;
    this.implicitTele = implicitTele;
    this.message = message;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityIntentactivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityIntentactivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_intentactivity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityIntentactivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.explicit;
      Button explicit = ViewBindings.findChildViewById(rootView, id);
      if (explicit == null) {
        break missingId;
      }

      id = R.id.implicit;
      Button implicit = ViewBindings.findChildViewById(rootView, id);
      if (implicit == null) {
        break missingId;
      }

      id = R.id.implicit_image;
      ImageButton implicitImage = ViewBindings.findChildViewById(rootView, id);
      if (implicitImage == null) {
        break missingId;
      }

      id = R.id.implicit_tele;
      ImageButton implicitTele = ViewBindings.findChildViewById(rootView, id);
      if (implicitTele == null) {
        break missingId;
      }

      id = R.id.message;
      EditText message = ViewBindings.findChildViewById(rootView, id);
      if (message == null) {
        break missingId;
      }

      return new ActivityIntentactivityBinding((LinearLayout) rootView, explicit, implicit,
          implicitImage, implicitTele, message);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
