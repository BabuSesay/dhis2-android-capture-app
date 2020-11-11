package org.dhis2.data.forms.dataentry.fields.coordinate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.auto.value.AutoValue;

import org.dhis2.R;
import org.dhis2.data.forms.dataentry.DataEntryViewHolderTypes;
import org.dhis2.data.forms.dataentry.fields.FieldViewModel;
import org.dhis2.data.forms.dataentry.fields.common.FieldUiModel;
import org.hisp.dhis.android.core.common.FeatureType;
import org.hisp.dhis.android.core.common.ObjectStyle;

/**
 * QUADRAM. Created by frodriguez on 1/24/2018.
 */

@AutoValue
public abstract class CoordinateViewModel extends FieldViewModel implements FieldUiModel {

    @Nullable
    public abstract FeatureType featureType();

    public static FieldViewModel create(String id, String label, Boolean mandatory, String value, String section, Boolean editable, String description, ObjectStyle objectStyle, FeatureType featureType) {
        return new AutoValue_CoordinateViewModel(id, label, mandatory, value, section, null, editable, null, null, null, description, objectStyle, null, DataEntryViewHolderTypes.COORDINATES, R.layout.custom_form_coordinate, featureType);
    }

    @Override
    public FieldUiModel setMandatory() {
        return new AutoValue_CoordinateViewModel(uid(), label(), true, value(), programStageSection(), null, editable(), null, warning(), error(), description(), objectStyle(), null, DataEntryViewHolderTypes.COORDINATES, R.layout.custom_form_coordinate, featureType());
    }

    @NonNull
    @Override
    public FieldUiModel withWarning(@NonNull String warning) {
        return new AutoValue_CoordinateViewModel(uid(), label(), mandatory(), value(), programStageSection(), null, editable(), null, warning, error(), description(), objectStyle(), null, DataEntryViewHolderTypes.COORDINATES, R.layout.custom_form_coordinate, featureType());
    }

    @NonNull
    @Override
    public FieldUiModel withError(@NonNull String error) {
        return new AutoValue_CoordinateViewModel(uid(), label(), mandatory(), value(), programStageSection(), null, editable(), null, warning(), error, description(), objectStyle(), null, DataEntryViewHolderTypes.COORDINATES, R.layout.custom_form_coordinate, featureType());
    }

    @NonNull
    @Override
    public FieldUiModel withValue(String data) {
        return new AutoValue_CoordinateViewModel(uid(), label(), mandatory(), data, programStageSection(), null, false, null, warning(), error(), description(), objectStyle(), null, DataEntryViewHolderTypes.COORDINATES, R.layout.custom_form_coordinate, featureType());
    }

    @NonNull
    @Override
    public FieldViewModel withEditMode(boolean isEditable) {
        return new AutoValue_CoordinateViewModel(uid(), label(), mandatory(), value(), programStageSection(), null, isEditable, null, warning(), error(), description(), objectStyle(), null, DataEntryViewHolderTypes.COORDINATES, R.layout.custom_form_coordinate, featureType());
    }
}
