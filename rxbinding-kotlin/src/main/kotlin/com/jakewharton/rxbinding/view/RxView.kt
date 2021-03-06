package com.jakewharton.rxbinding.view

import android.view.DragEvent
import android.view.View
import rx.Observable
import rx.functions.Action1

/**
 * Create an observable of timestamps for clicks on {@code view}.
 * <p>
 * <em>Warning:</em> The created observable keeps a strong reference to {@code view}. Unsubscribe
 * to free this reference.
 * <p>
 * <em>Warning:</em> The created observable uses {@link View#setOnClickListener} to observe
 * clicks. Only one observable can be used for a view at a time.
 */
public inline fun View.clicks(): Observable<Any> = RxView.clicks(this)

/**
 * Create an observable of click events for {@code view}.
 * <p>
 * <em>Warning:</em> The created observable keeps a strong reference to {@code view}. Unsubscribe
 * to free this reference.
 * <p>
 * <em>Warning:</em> The created observable uses {@link View#setOnClickListener} to observe
 * clicks. Only one observable can be used for a view at a time.
 */
public inline fun View.clickEvents(): Observable<ViewClickEvent> = RxView.clickEvents(this)

/**
 * Create an observable of {@link DragEvent} for drags on {@code view}.
 * <p>
 * <em>Warning:</em> The created observable keeps a strong reference to {@code view}. Unsubscribe
 * to free this reference.
 * <p>
 * <em>Warning:</em> The created observable uses {@link View#setOnDragListener} to observe
 * drags. Only one observable can be used for a view at a time.
 */
public inline fun View.drags(): Observable<DragEvent> = RxView.drags(this)
// TODO overload with Func

/**
 * Create an observable of drag events for {@code view}.
 * <p>
 * <em>Warning:</em> The created observable keeps a strong reference to {@code view}. Unsubscribe
 * to free this reference.
 * <p>
 * <em>Warning:</em> The created observable uses {@link View#setOnDragListener} to observe
 * drags. Only one observable can be used for a view at a time.
 */
public inline fun View.dragEvents(): Observable<ViewDragEvent> = RxView.dragEvents(this)
// TODO overload with Func

/**
 * Create an observable of booleans representing the focus of {@code view}.
 * <p>
 * <em>Warning:</em> The created observable keeps a strong reference to {@code view}. Unsubscribe
 * to free this reference.
 * <p>
 * <em>Warning:</em> The created observable uses {@link View#setOnFocusChangeListener} to observe
 * focus change. Only one observable can be used for a view at a time.
 */
public inline fun View.focusChanges(): Observable<Boolean> = RxView.focusChanges(this)

/**
 * Create an observable of focus-change events for {@code view}.
 * <p>
 * <em>Warning:</em> The created observable keeps a strong reference to {@code view}. Unsubscribe
 * to free this reference.
 * <p>
 * <em>Warning:</em> The created observable uses {@link View#setOnFocusChangeListener} to observe
 * focus change. Only one observable can be used for a view at a time.
 */
public inline fun View.focusChangeEvents(): Observable<ViewFocusChangeEvent> = RxView.focusChangeEvents(this)

/**
 * Create an observable of timestamps for long-clicks on {@code view}.
 * <p>
 * <em>Warning:</em> The created observable keeps a strong reference to {@code view}. Unsubscribe
 * to free this reference.
 * <p>
 * <em>Warning:</em> The created observable uses {@link View#setOnLongClickListener} to observe
 * long clicks. Only one observable can be used for a view at a time.
 */
public inline fun View.longClicks(): Observable<Any> = RxView.longClicks(this)
// TODO overload with Func

/**
 * Create an observable of long-clicks events for {@code view}.
 * <p>
 * <em>Warning:</em> The created observable keeps a strong reference to {@code view}. Unsubscribe
 * to free this reference.
 * <p>
 * <em>Warning:</em> The created observable uses {@link View#setOnLongClickListener} to observe
 * long clicks. Only one observable can be used for a view at a time.
 */
public inline fun View.longClickEvents(): Observable<ViewLongClickEvent> = RxView.longClickEvents(this)
// TODO overload with Func

/**
 * An action which sets the activated property of {@code view}.
 * <p>
 * <em>Warning:</em> The created observable keeps a strong reference to {@code view}. Unsubscribe
 * to free this reference.
 */
public inline fun View.activated(): Action1<in Boolean> = RxView.activated(this)

/**
 * An action which sets the clickable property of {@code view}.
 * <p>
 * <em>Warning:</em> The created observable keeps a strong reference to {@code view}. Unsubscribe
 * to free this reference.
 */
public inline fun View.clickable(): Action1<in Boolean> = RxView.clickable(this)

/**
 * An action which sets the enabled property of {@code view}.
 * <p>
 * <em>Warning:</em> The created observable keeps a strong reference to {@code view}. Unsubscribe
 * to free this reference.
 */
public inline fun View.enabled(): Action1<in Boolean> = RxView.enabled(this)

/**
 * An action which sets the pressed property of {@code view}.
 * <p>
 * <em>Warning:</em> The created observable keeps a strong reference to {@code view}. Unsubscribe
 * to free this reference.
 */
public inline fun View.pressed(): Action1<in Boolean> = RxView.pressed(this)

/**
 * An action which sets the selected property of {@code view}.
 * <p>
 * <em>Warning:</em> The created observable keeps a strong reference to {@code view}. Unsubscribe
 * to free this reference.
 */
public inline fun View.selected(): Action1<in Boolean> = RxView.selected(this)

/**
 * An action which sets the visibility property of {@code view}.
 * <p>
 * <em>Warning:</em> The created observable keeps a strong reference to {@code view}. Unsubscribe
 * to free this reference.
 *
 * @param visibilityWhenFalse Visibility to set on a {@code false} value ({@link View#INVISIBLE
 * View.INVISIBLE} or {@link View#GONE View.GONE}).
 */
public inline fun View.visibility(visibilityWhenFalse: Int = View.GONE): Action1<in Boolean> {
  return RxView.visibility(this, visibilityWhenFalse)
}
