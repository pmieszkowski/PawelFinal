package com.example.student7.pawelfinal.ItemView;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

@EViewGroup(R.layout.recipe_item_view)
public class RecipeItemView extends RelativeLayout {

    @ViewById
    TextView title;

    @ViewById
    TextView introduction;

    public RecipeItemView(Context context) {
        super(context);
    }

    public void bind(Recipe recipe) {
        title.setText(recipe.title);
        introduction.setText(recipe.introduction);
    }
}
